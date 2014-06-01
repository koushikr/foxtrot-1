Foxtrot
=========

Foxtrot is a data store abstraction service for storing event data for real-time systems. It combines the power of fast row get/put by HBase and powerful indexing and aggregation features provided by Elasticsearch. Foxtrot provides:

  - REST api's for event ingestion with batched input, simple analytics and other functionality
  - Reconfigurable console builder to build useful consoles that can be shared among people
  - Intelligent caching of queries to load-balance on console heavy query loads
  - A very extensible design that needs three annotated classes to be added to the source for adding a new kind of analytics operation

Documentation
-------------
Check the [Wiki](https://github.com/flipkart-incubator/foxtrot/wiki/Introduction) for detailed documentation.

Version
----

0.1

Tech
-----------

Foxtrot uses a number of open source projects to work properly:

* [Elasticsearch](http://www.elasticsearch.org/) - awesome distributed search query store based on lucene
* [HBase](http://hbase.apache.org/) - distributed, scalable big data-store
* [Hazelcast](http://hazelcast.org/) - distributed data grid
* [Dropwizard](https://dropwizard.github.io/dropwizard/) - REST web services framework
* [Twitter Bootstrap 3](http://getbootstrap.com/) - great UI boilerplate for modern web apps
* [Bootstrap validator](https://github.com/1000hz/bootstrap-validator) - a form validation plugin for bootstrap
* [Bootstrap select](http://silviomoreto.github.io/bootstrap-select/) - A ui selection widget for bootstrap
* [Flot](http://www.flotcharts.org/) - superfast javascript charting library
* [D3](http://d3js.org/) - data visualization library
* [Handlebars](http://handlebarsjs.com/) - templating library
* [jQuery](http://jquery.com) - duh
* [jQuery UI](http://jqueryui.com) - extensible ui framework

Contribution, Bugs and Feedback
-------------------------------

For bugs, questions and discussions please use the [Github Issues](https://github.com/flipkart-incubator/foxtrot/issues).

Please follow the [contribution guidelines](https://github.com/flipkart-incubator/foxtrot/blob/master/CONTRIBUTING.md) when submitting pull requests.


LICENSE
-------

Copyright 2014 Flipkart Internet Pvt. Ltd.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

