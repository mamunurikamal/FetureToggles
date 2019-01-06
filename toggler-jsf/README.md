[![Build Status][travis-badge]][travis-badge-url]

Togglz JSF Example
===================
This is  a JSF example using [**Togglz**](https://www.togglz.org/). 
Togglz is an implementation of Martin Fowler's 
 [Feature Toggles](http://martinfowler.com/bliki/FeatureToggle.html) pattern for Java.
 
If you are interested in knowing more about this project, you can find it in my blog posts
['Toying with Togglz'](https://indrabasak.wordpress.com/2016/03/31/toying-with-togglz/) and
['Togglz Integration with JSF and Spring'](https://indrabasak.wordpress.com/2016/03/30/togglz-integration-with-jsf-and-spring/).

# Build
Execute the following command from the parent directory to compile the project:

```
mvn clean install
```
Once the build completes successfully, you should have the artifact `togglz-jsf-example.war` in the `target` folder.

# Deploy
You can deploy the `togglz-jsf-example.war` in a [Tomcat](http://tomcat.apache.org/) web container or any other JEE web 
container of your choice.

# Test
You can access the example page at `http://localhost:8080/togglz-jsf-example`

#### Access Togglz Admin Console
URL: `http://localhost:8080/togglz-jsf-example/togglz`


[travis-badge]: https://travis-ci.org/indrabasak/togglz-jsf-example.svg?branch=master
[travis-badge-url]: https://travis-ci.org/indrabasak/togglz-jsf-example/
