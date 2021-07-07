from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola Mundo")    
    car = Car("ASDSD", Account("El nombre", "ASDF4345"))
    print(vars(car))
    print(vars(car.driver))