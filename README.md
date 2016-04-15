# JavaCalc

## Build & Test Results
### Branch master
[![Build 
Status](https://travis-ci.org/TLoebner/JavaCalc.svg?branch=master)](https://travis-ci.org/TLoebner/JavaCalc)
[![Circle CI](https://circleci.com/gh/TLoebner/JavaCalc/tree/master.svg?style=svg)](https://circleci.com/gh/TLoebner/JavaCalc/tree/master)
[ ![Codeship Status for TLoebner/JavaCalc](https://codeship.com/projects/7c6e8220-e47c-0133-76f3-7ef381c09b10/status?branch=master)](https://codeship.com/projects/146354)
[ ![Codeship Status for TLoebner/JavaCalc](https://codeship.com/projects/7c6e8220-e47c-0133-76f3-7ef381c09b10/status?branch=master)](https://codeship.com/projects/146354)
[![Run Status](https://api.shippable.com/projects/571139c22a8192902e1c8dea/badge?branch=master)](https://app.shippable.com/projects/571139c22a8192902e1c8dea)
[![Coverage Badge](https://api.shippable.com/projects/571139c22a8192902e1c8dea/coverageBadge?branch=master)](https://app.shippable.com/projects/571139c22a8192902e1c8dea)
[![wercker status](https://app.wercker.com/status/15e2d58f254cb7f999969708ca771149/m/master "wercker status")](https://app.wercker.com/project/bykey/15e2d58f254cb7f999969708ca771149)

## Build options

### Jobs in build.xml (ant)

```
build				-	build classes from source
test				-	perform JUnit-tests
doc					-	create standard javadoc documentation
UML_doc				-	create UML-files with javadoc using ydoc
clean				-	clean all
```

### Jobs in pom.xml (maven)

```
build				-	build classes from source
test				-	perform JUnit-tests
javadoc:jar			-	create UML-files with javadoc using ydoc for sources
javadoc:test-jar	-	create UML-files with javadoc using ydoc for test cases
clean				-	clean all
```
