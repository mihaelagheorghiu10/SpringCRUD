# Football Players CRUD

A mini project part of a Spring spike to practice generating a simple CRUD Rest API

## Objective

To generate a CRUD Rest Api to manage a list of football players.

### Model

#### Football Player

UUID id
String name

### Controller - Endpoints

<table>
<tr><th>Method</th><th>Endpoint</th><th>Returns</th><th>Calls</th><th>Params</th></tr>
<tr>
<td>GET</td><td>/players</td><td>List&lt;FootballPlayer&gt;</td><td>getAllPlayers()</td><td>None</td>
</tr>
<tr>
<td>GET</td><td>/players/:id</td><td>FootballPlayer</td><td>getById(id)</td><td>UUID id</td>
</tr>
<tr>
<td>POST</td><td>/players</td><td>FootballPlayer</td><td>createPlayer(player)</td><td>FootballPlayer player</td>
</tr>
<tr>
<td>DELETE</td><td>/players</td><td>FootballPlayer</td><td>deletePlayerById(id)</td><td>UUID id</td>
</tr>
<tr>
<td>PUT</td><td>/players</td><td>FootballPlayer</td><td>updatePlayerById(id,newPlayerData)</td><td>UUID id, FootballPlayer newPlayerData</td>
</tr>
<tr>
<td>GET</td><td>/players</td><td>List&lt;FootballPlayer&gt;</td><td>searchPlayerBy(name)</td><td>String name</td>
</tr>

</table>

## OUR TEAM

<a href="https://github.com/mihaelagheorghiu10/SpringCRUD/graphs/contributors">
  <img src="https://contrib.rocks/image?repo=mihaelagheorghiu10/SpringCRUD" />
</a>

