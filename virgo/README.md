Our first code problem.

Here are my thoughts:

1. This code is using spring DS and Spring. They are deployed in Virgo server.
2. Structure looks ok, there is one service definition, DictQueryService, and two implementations:
LocalQueryServiceImpl and RemoteQueryServiceImpl.
3. DictQueryContoller does not have @Autowired for dictQueryService. Maybe we should try that.
The service does look like have been exported and imported correctly.
4. If @Autowired does not work, let's define the bean manually and inject the dictQueryService manually. This way, we can see if Spring have any errors during server startup time.
  

