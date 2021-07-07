<?php

include('Car.php');
include('Account.php');

$car = new Car("ASDASD", new Account("El nombre", "ASDAS23"));
$car->printDataCar();