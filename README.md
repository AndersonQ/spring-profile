# spring-profile

A wee spring-profile example

## Motivation
Present a lightning talk about `Spring Profiles` 

## Requirements

1) Java JDK version 8 or later

## Usage

```bash
./gradlew bootRun
```

### Choosing a profile

We have define 3 profiles: `dev, prod, default`

To use a profile you must define the environment property `spring.profiles.active` in any of the usual ways (see the [docs](https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-profiles.html))

 - You can include `spring.profiles.active=dev` on your `application.properties`, OR

 - on command line using the switch `--spring.profiles.active=dev` OR
 
 - set the environment variable `SPRING_PROFILES_ACTIVE=dev` on your terminal

If no profile is defined *spring* uses the `default`


Using the third option you can run the different profiles with:

```bash
SPRING_PROFILES_ACTIVE=dev ./gradlew bootRun
SPRING_PROFILES_ACTIVE=prod ./gradlew bootRun
SPRING_PROFILES_ACTIVE=default ./gradlew bootRun
./gradlew bootRun # default profile
```

## License

Copyright © 2017 Anderson Queiroz

Distributed under the GNU General Public License either version 3.0 or any later version.