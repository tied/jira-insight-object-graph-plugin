/*
 * #%L
 * insight-object-graph
 * %%
 * Copyright (C) 2018 - 2020 The Plugin Authors
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

package com.linktime.plugin.jira.insightobjectgraph.api.objects

interface ListObjectsService {

    fun getIssues(type: String): IssueListRootNode?

    data class IssueListRootNode(val issues: List<IssueNode>)

    data class IssueNode(val id: Long, val fields: List<FieldNode>)

    data class FieldNode(val name: String, val values: List<String>)

    fun getObjects(objectTypeName: String,
                          schemaId: Int?,
                          attributes: Set<String>,
                          resolveAttributes: Set<String>,
                          resolveRelations: Boolean,
                          iqlString: String?): InsightObjectListRootNode?

    data class InsightObjectListRootNode(val objects: List<InsightObjectNode>)

    data class InsightObjectNode(val id: Int, val attributes: List<InsightObjectAttributeNode>)

    data class InsightObjectAttributeNode(val name: String, val values: List<String>)

}