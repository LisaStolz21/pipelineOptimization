echo on

set AS_JAVA=C:\Program Files\Java\zulu8.56.0.21-ca-jdk8.0.302-win_x64
set JAVA_HOME=C:\Program Files\Java\zulu8.56.0.21-ca-jdk8.0.302-win_x64
set "glassfishDir=C:\Users\Lisa\Downloads\payara-5.2020.4\payara5\glassfish"

set "domainName=pipelineOptDomain"
set "domainDir=%glassfishDir%\domains\%domainName%"

call %glassfishDir%\bin\asadmin create-domain --nopassword %domainName%
copy postgresql-42.2.18.jar %domainDir%\lib\ext

call %glassfishDir%\bin\asadmin start-domain %domainName%

call %glassfishDir%\bin\asadmin create-jdbc-connection-pool --datasourceclassname org.postgresql.ds.PGSimpleDataSource --restype javax.sql.DataSource --driverclassname org.postgresql.Driver --property user=postgres:password=postgres:url="jdbc\:postgresql\://localhost\:5432/postgres" PIPELINE_JDBC

call %glassfishDir%\bin\asadmin ping-connection-pool PIPELINE_JDBC

call %glassfishDir%\bin\asadmin create-jdbc-resource --connectionpoolid PIPELINE_JDBC jdbc/pipelineopt

call %glassfishDir%\bin\asadmin stop-domain %domainName%

:End