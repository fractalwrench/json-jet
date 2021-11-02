# Json Jet

Yet another JSON library for the JVM.

## Motivation

JSON Jet is a small library that focuses on one task: serializing and deserializing JSON from streams.

The advantages of this library are:

- A small, simple implementation. At just two source files, this library can easily be dropped into a project with minimal impact on the binary's size.
- Limited memory usage. Reading/writing one token at a time reduces the amount of memory used at any one time (subject to GC).
- Code that doesn't try to do anything too clever, but attempts some optimizations where it's sensible.

This library is not thread safe - you should confine the readers/writers to one thread at a time.

### TODO list
- create a skeleton of the API
- serializeNull option
- indent option
- Options API in ctors
- setup a test suite with JSON expected/observed documents
- create example apps for Android + Java
- test on newer JDK version? Much faster...
- nullability annotations

#### Benchmarks
TODO: benchmark it on JVM
TODO: benchmark it on Android

#### Optimization ideas
- Encoding cache for common values (true, null, false, keys, etc...)
- profile return value of chained methods
- 
