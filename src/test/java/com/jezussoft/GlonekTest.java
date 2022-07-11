package com.jezussoft;

import com.jezussoft.impreza.Glonek;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GlonekTest {

    private Glonek testowyAdrian;

    @BeforeEach
    public void przedKazdymTestem() {
        testowyAdrian = new Glonek(); // stworz nowego glonka, trzezwego i w ogole
    }

    @Test
    public void picieZwiekszaUpicie() {
        // given
        double promilePrzed = testowyAdrian.getUpojenieAlkoholoweWPromilach();

        // when
        testowyAdrian.wypijPiwo();

        // then
        double promilePo = testowyAdrian.getUpojenieAlkoholoweWPromilach();
        Assertions.assertTrue(promilePrzed < promilePo);
    }

    @Test
    public void wiejskaZmniejszaUpicie() {
        // given
        testowyAdrian.wypijPiwo();
        double promilePrzed = testowyAdrian.getUpojenieAlkoholoweWPromilach();

        // when
        testowyAdrian.jedzWiejska(1);

        // then
        double promilePo = testowyAdrian.getUpojenieAlkoholoweWPromilach();
        Assertions.assertTrue(promilePrzed > promilePo);
    }

    @Test
    public void senWCorsieZmniejszaUpicie() {
        // given
        testowyAdrian.wypijPiwo();
        double promilePrzed = testowyAdrian.getUpojenieAlkoholoweWPromilach();

        // when
        testowyAdrian.spijWKorsie(1);

        // then
        double promilePo = testowyAdrian.getUpojenieAlkoholoweWPromilach();
        Assertions.assertTrue(promilePrzed > promilePo);
    }
}
