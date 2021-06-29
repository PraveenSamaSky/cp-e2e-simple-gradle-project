public class SkyStoreWebGuide {

    /**
     * The department is made up of a small number of teams, each of which provide a
     * well-defined set of services to both internal clients (such as other teams within Sky)
     * and external clients such as consumer end (CE) devices including mobile, desktop,
     * gaming consoles and set-top boxes (STBs).
     As a member of the End-to-End Testing team, you will be working closely with these
     teams to ensure the service quality and integrity, creating automated system integration tests,
     troubleshooting integration issues and other ad-hoc tasks.
     One of the teams you may work with is the Skystore team  which, among several
     other services, provides information about list of movies available for Buy and Rent  via a REST API.
     Your task is write an automated test to verify one of these APIs:

     Given the endpoint:
     https://www.skystore.com/api/web/v2/catalog/assets/top/<uuid>/<genre>
     Mandatory Header : x-api-key = l_web_sparrow
     x-api-user-agent:Web/5.69.0
     x-api-device-model:Chrome
     x-api-device-manufacturer:MAC OS
     x-api-key:l_web_sparrow
   

     Write a test case that
     1) Sends a GET request to the above API using
     MACOS
     9fe6ace0-0ba3-43d4-8ce2-8b39331244e0 , new-to-buy
     a89cebbc-cf17-41c1-9817-e318be9edf6f , new-to-rent
     WINDOWS
     49fd6b8d-3e69-4750-94b8-af261df16ff9,rental-offers
     85481a72-751a-4256-87f8-97523b6c8f53,under-3
     2) Study the JSON payload returned
     3) Write simple tests to:
     - Count and verify the number of assets returned
     - Take the first asset from the JSON payload- verify the following fields – title, year , assetType , catalogSelection
     */

}
