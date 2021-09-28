package br.com.alex.router.di

import br.com.alex.router.FeatureRouter
import br.com.alex.router.StandardFeatureRouter
import br.com.alex.router.rule.ActionRule
import br.com.alex.router.rule.StandardActionRule
import org.koin.dsl.module

object RouterModule {
    val instance = module {
        factory<ActionRule> {
            StandardActionRule()
        }
        factory<FeatureRouter> {
            StandardFeatureRouter(get())
        }
    }
}