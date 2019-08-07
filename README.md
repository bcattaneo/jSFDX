# jSFDX
Java wrapper for Salesforce's SFDX CLI

**This is currently a work in progress!**

## Dependencies
* gson

## Contributing

I'm writing each sfdx command as individual methods, using a builder pattern for the params.

If you'd like to contribute (even on this early stage of the project) you can write your methods based on `JSfdx.forceOrgList(...)` (wrapper for `sfdx force:org:list`). You'd have to add a new method for your command, _maybe_ a type, and of course a Params class for it.

Here's an example call, which looks pretty elegant when there's lots of optional parms:
```java
JSfdx jsfdx = new JSfdx();
// Example force:org:list usage, all parms used.
ForceOrgList forceOrgListCmd = jsfdx.forceOrgList(new ForceOrgListParams.Builder()
        .all()
        .clean()
        .logLevel(LogLevel.trace)
        .noPrompt()
        .verbose()
        .build()
        );
// Access any of the type attributes:
// Get access token of your first org
System.out.println(forceOrgListCmd.getResult().getNonScratchOrgs()[0].getAccessToken());
```

## License
GNU GPL v3
