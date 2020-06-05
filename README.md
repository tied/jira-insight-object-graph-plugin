# Insight Object Graph for Jira
![Build Status](https://github.com/linked-planet/jira-insight-object-graph-plugin/workflows/Maven/badge.svg)
[![GitHub License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

Provides a REST API to simplify [Mindville Insight][insight] object access.

## Motivation
If you need to retrieve field data for lots of Insight objects, you
need many REST calls to accomplish this. This has a negative impact on the
performance of the client application. Furthermore, the standard Insight REST API
will send responses that contain plenty of information that is not usable to your
application.

## Overview
This plugin provides REST endpoints as explained below.

### /issues
See [doc/rest/api-issues.yml](doc/rest/api-issues.yml)

Retrieve all Jira issues having related objects in a given Insight custom field.


### /object-graph
See [doc/rest/api-object-graph.yml](doc/rest/api-object-graph.yml)

Describes an object graph (objects are linked via relations) and every object
contains it's attribute values. Data is properly aggregated.


### /objects
See [doc/rest/api-objects.yml](doc/rest/api-objects.yml)

Retrieve all objects of a given object type, allowing to set IQL filter,
select attributes to retrieve and to resolve names of linked objects.


[insight]: https://www.mindville.com/insight-asset-management-CMDB-software-for-jira