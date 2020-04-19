[![Build Status](https://travis-ci.org/allefsousa/Android-Test-Coverage.svg?branch=master)](https://travis-ci.org/allefsousa/Android-Test-Coverage)   [![codecov](https://codecov.io/gh/allefsousa/AndroidTestCoverage/branch/master/graph/badge.svg)](https://codecov.io/gh/allefsousa/AndroidTestCoverage)  [![ktlint](https://img.shields.io/badge/code%20style-%E2%9D%A4-FF4081.svg)](https://ktlint.github.io/)  [![BCH compliance](https://bettercodehub.com/edge/badge/allefsousa/Android-Test-Coverage?branch=master)](https://bettercodehub.com/) [![codebeat badge](https://codebeat.co/badges/0af8f2e2-77e6-44b7-9c2a-713b734c34b0)](https://codebeat.co/projects/github-com-allefsousa-android-test-coverage-master) [![Open Source Love](https://badges.frapsoft.com/os/v1/open-source.svg?v=103)](https://opensource.org/licenses/MIT) [![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT) [![Build Status](https://app.bitrise.io/app/7a6f5cd6eec731d5/status.svg?token=Z8A3sVZh3yusXl4EmTNzRg)](https://app.bitrise.io/app/7a6f5cd6eec731d5) [![Build Status](https://travis-ci.org/allefsousa/Android-Test-Coverage.svg?branch=master)](https://travis-ci.org/allefsousa/Android-Test-Coverage)


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
Code Quality ktlint

```bash
./gradlew ktlint
```
Code Quality detekt

```bash
./gradlew detekt
```

![GkW5y6QUX4S3wrsckBdK8Pr4bcs1-qd23ysj](https://user-images.githubusercontent.com/7042627/79526500-cc770780-803b-11ea-872c-fc1b0e18067a.jpeg)



