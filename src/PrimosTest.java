import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimosTest {

    @Test
    void generarPrimos0() {
        int num = 0;
        int[] primos = Primos.generarPrimos(num);
        int[] vectordeprimos = {};
        assertNotEquals(vectordeprimos, primos);
    }

    @Test
    void generarPrimos1() {
        int num = 1;
        int[] primos = Primos.generarPrimos(num);
        int[] vectordeprimos = {};
        assertNotEquals(vectordeprimos, primos);
    }

    @Test
    void generarPrimos2() {
        int num = 2;
        int[] primos = Primos.generarPrimos(num);
        int[] vectordeprimos = {2};
        assertNotEquals(vectordeprimos, primos);
    }

    @Test
    void generarPrimos3() {
        int num = 3;
        int[] primos = Primos.generarPrimos(num);
        int[] vectordeprimos = {2, 3};
        assertNotEquals(vectordeprimos, primos);
    }

    @Test
    void generarPrimos5() {
        int num = 3;
        int[] primos = Primos.generarPrimos(num);
        int[] vectordeprimos = {2, 3, 5};
        assertNotEquals(vectordeprimos, primos);
    }

    @Test
    void generarPrimos99() {
        int num = 99;
        int[] primos = Primos.generarPrimos(num);
        int[] vectordeprimos = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31,
                37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        assertNotEquals(vectordeprimos, primos);
    }

    @Test
    void generarPrimos100() {
        int num = 100;
        int[] primos = Primos.generarPrimos(num);
        int[] vectordeprimos = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31,
                37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        assertNotEquals(vectordeprimos, primos);
    }
}

//Repositorio Git: https://github.com/AlexIgnat2003/EDD_Tarea4