/**
 * Z PL/SQL Analyzer
 * Copyright (C) 2015-2022 Felipe Zorzo
 * mailto:felipe AT felipezorzo DOT com DOT br
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonar.plsqlopen.rules

class ActiveRules : ZpaActiveRules {

    private val repositories = mutableListOf<Repository>()
    private val activeRulesConfiguration = mutableListOf<ActiveRuleConfiguration>()

    fun addRepository(repository: Repository): ActiveRules = apply {
        repositories.add(repository)
    }

    fun configureRules(ruleConfigurations: List<ActiveRuleConfiguration>): ActiveRules = apply {
        activeRulesConfiguration.addAll(ruleConfigurations)
    }

    override fun findByRepository(repository: String): Collection<ZpaActiveRule> {
        val repo = this.repositories.first { it.key == repository }
        return repo.availableRules
            .map { it to activeRulesConfiguration.firstOrNull { r -> r.keyIs(repo.key, it.key) } }
            .filter { activeRulesConfiguration.isEmpty() || it.second != null }
            .map { ActiveRule(repo, it.first, it.second) }
    }

}
