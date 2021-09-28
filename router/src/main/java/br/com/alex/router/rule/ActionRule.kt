package br.com.alex.router.rule

import android.content.Context
import br.com.alex.router.actions.Action

interface ActionRule {
    fun shouldAllowNavigation(action: Action): Boolean
    fun onNotAllowedNavigation(context: Context, action: Action)
}

internal class StandardActionRule : ActionRule {
    override fun shouldAllowNavigation(action: Action): Boolean = true
    override fun onNotAllowedNavigation(context: Context, action: Action) = Unit
}