# Simple MDB for EÁP 7.0

## Run on standalone EAP 7

Start eap7 with full profile:


    $EAP_HOME/bin/standalone.sh -c standalone-full.xml


Insert queue:


    $EAP_HOME/bin/jboss-cli.sh --connect  --file=/home/nmajorov/workspace/missions/Sympany/simple-mdb/jboss.cli 
        
    The batch executed successfully
    {   
        "outcome" => "success",
        "result" => undefined
    }

build application:


    mvn clean install


deploy mdb bean by simply coping the jar file:

	
	cp ./target/mdb-1.0-SNAPSHOT.jar /jboss-eap-7.0/standalone/deployments/


run client:


	mvn  exec:java

