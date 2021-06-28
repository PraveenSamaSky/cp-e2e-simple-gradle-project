/**
 * Created by oej01 on 15/05/2017.
 */
public class OnlineTVGuide {

    /**
     * The department is made up of a small number of teams, each of which provide a
     * well-defined set of services to both internal clients (such as other teams within Sky)
     * and external clients such as consumer end (CE) devices including mobile, desktop,
     * gaming consoles and set-top boxes (STBs).

     As a member of the End-to-End Testing team, you will be working closely with these
     teams to ensure the service quality and integrity, creating automated system integration tests,
     troubleshooting integration issues and other ad-hoc tasks.

     One of the teams you may work with is the EPG team (Electronic Programme Guide) which, among several
     other services, provides information about TV schedules to Consumer End devices via a REST API.

     Your task is write an automated test to verify one of these APIs:

     Given the endpoint:

     http://stage-awk.epgsky.com/hawk/linear/services/<Bouquet>/<subBouquet>

     Headers : X-SkyOTT-Territory=DE

     Headers : X-SkyOTT-Territory=IT


     Write a test case that

     1) Sends a GET request to the above API using
     DE : 4 ,0
     4 , 1

     IT : 25168 , 0
     25168 , 1

     2) Study the JSON payload returned

     3) Write simple tests to:
     - Count and verify the number of items in list of services
     - Take the first event from the JSON payload- verify the following fields – sid, t , sg , xsg

     */
}
