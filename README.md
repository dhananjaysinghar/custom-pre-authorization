# custom-pre-authorization

~~~
@PreAuthorize("@UserAccessService.hasAuthority(@environment.getProperty('app.security.access-right.hello-endpoint'), #name)")
~~~
