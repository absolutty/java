# Assertions
https://docs.oracle.com/javase/7/docs/technotes/guides/language/assert.html <br>
- umožňuje testovanie predpokladov programu
- každá *assertion* (tvrdenie, uistenie sa) obsahuje boolean, pokiaľ sa **nevyhodnotí** ako true, vypíše to
  - true: test pokračuje
  - false: test končí chybou (vypíše sa to)
- **Assertions.assertEquals(očakávaná, skutočná)**: vyhodnocuje ROVNOSŤ zadaných parametrov. Môže byť použitý viacej krát, test bude tak či tak pokračovať.
- **Assertions.assertTrue(pravdivostnyVyraz)**: vyhodnocuje PRAVDIVOSŤ vyrázu. [true:test pokračuje | false: test končí chybou]
- **Assertions.assertFalse(pravdivostnyVyraz)**: vyhodnocuje NEPRAVDIVOSŤ vyrázu. [false: test pokračuje | true: test končí chybou]
