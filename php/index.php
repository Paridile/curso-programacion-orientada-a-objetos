<?php

require_once('Car.php');
require_once('UberX.php');
require_once('UberPool.php');
require_once('Account.php');

// $car = new Car("ASDASD", new Account("El nombre", "ASDAS23"));
// $car->printDataCar();

$uberX = new UberX("ASDASD", new Account("El nombre", "ASDFS123"),"Chevrolet","Spark");
$uberX->printDataCar();
echo "<br>";
$uberPool = new UberPool("QWERTY", new Account("Otro nombre", "RGDFG34"),"Dodge","Attitude");
$uberPool->PrintDataCar();