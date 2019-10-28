[![Build Status](https://travis-ci.org/allefsousa/Android-Test-Coverage.svg?branch=master)](https://travis-ci.org/allefsousa/Android-Test-Coverage)   [![codecov](https://codecov.io/gh/allefsousa/AndroidTestCoverage/branch/master/graph/badge.svg)](https://codecov.io/gh/allefsousa/AndroidTestCoverage)  [![ktlint](https://img.shields.io/badge/code%20style-%E2%9D%A4-FF4081.svg)](https://ktlint.github.io/)  [![BCH compliance](https://bettercodehub.com/edge/badge/allefsousa/Android-Test-Coverage?branch=master)](https://bettercodehub.com/) [![codebeat badge](https://codebeat.co/badges/0af8f2e2-77e6-44b7-9c2a-713b734c34b0)](https://codebeat.co/projects/github-com-allefsousa-android-test-coverage-master) [![Open Source Love](https://badges.frapsoft.com/os/v1/open-source.svg?v=103)]


## How to run

Your reports will be generate inside build folder: **app/build/reports/jacoco**

```bash
./gradlew clean jacocoTestReport
```
Unit Test 

```bash
./gradlew test
```

Instrumented Unit Test

```bash
./gradlew connectedAndroidTest
```

Monkey Test

```bash
adb shell monkey -p <app_package> -v <event_count>
```



