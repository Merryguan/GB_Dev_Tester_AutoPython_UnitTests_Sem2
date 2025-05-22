package seminars.second.hw;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class VehicleTest {

    static Car car;
    static Motorcycle motorcycle;

    @BeforeAll
    public static void init() {

        car = new Car("Toyota", "123", 2003);
        motorcycle = new Motorcycle("Toyota", "123", 2003);

    }

//  Проект Vehicle. Написать следующие тесты с использованием JUnit5:
//  - Проверить, что экземпляр объекта Car также является
//    экземпляром транспортного средства (используя оператор instanceof).
    @Test
    public void isCarVehicle() {

        Boolean isVehicle = car instanceof Vehicle;
        assertTrue(isVehicle);

    }

//  - Проверить, что объект Car создается с 4-мя колесами.
    @Test
    public void isCarHaveFourWheels() { assertThat(car.getNumWheels()).isEqualTo(4); }

//  - Проверить, что объект Motorcycle создается с 2-мя колесами.
    @Test
    public void isMotorcycleHaveTwoWheels() { assertThat(motorcycle.getNumWheels()).isEqualTo(2); }

//   - Проверить, что объект Car развивает скорость 60
//     в режиме тестового вождения (используя метод testDrive()).
    @Test
    public void isCarHaveVelocity60InTestDrive() {

        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);

    }

//  - Проверить, что объект Motorcycle развивает скорость 75
//    в режиме тестового вождения (используя метод testDrive()).
    @Test
    public void isMotorcycleHaveVelocity75InTestDrive() {

        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);

    }

//  - Проверить, что в режиме парковки
//    (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
//    машина останавливается (speed = 0).
    @Test
    public void isCarHaveVelocityZeroAfterParking() {

        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);

    }

//  - Проверить, что в режиме парковки
//    (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
//    мотоцикл останавливается (speed = 0).
    @Test
    public void isMotorcycleHaveVelocityZeroAfterParking() {

        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);

    }

}