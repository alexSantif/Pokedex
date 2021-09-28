package br.com.alex.router

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import br.com.alex.router.actions.Action
import br.com.alex.router.rule.ActionRule

typealias IntentParams = Bundle.() -> Unit

interface FeatureRouter {
    fun start(
        context: Context,
        action: Action,
        vararg flags: Int,
        args: IntentParams = {}
    )
}

internal class StandardFeatureRouter(private val actionRule: ActionRule) : FeatureRouter {

    override fun start(context: Context, action: Action, vararg flags: Int, args: IntentParams) {
        if (actionRule.shouldAllowNavigation(action)) {
            val intent = createIntent(context, action, flags, args)
            context.startActivity(intent)
        } else {
            actionRule.onNotAllowedNavigation(context, action)
        }
    }

    private fun createIntent(
        context: Context,
        action: Action,
        flags: IntArray? = null,
        args: IntentParams = {}
    ) = Intent(action.name)
        .putExtras(Bundle().apply(args))
        .setPackage(context.packageName)
        .apply {
            flags?.forEach { addFlags(it) }
        }
}