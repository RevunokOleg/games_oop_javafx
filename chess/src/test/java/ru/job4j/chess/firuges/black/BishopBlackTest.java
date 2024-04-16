package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import static org.assertj.core.api.Assertions.assertThat;

class BishopBlackTest {

    @Test
    public void whenBishopBlackPositionIsEqualToStarPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        Cell excepted = Cell.C8;
        assertThat(bishopBlack.position()).isEqualTo(excepted);
    }

    @Test
    void whenBishopBlackCopyPositionIsEqualToStarPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        Cell excepted = Cell.D7;
        assertThat(bishopBlack.copy(Cell.D7).position()).isEqualTo(excepted);
    }

    @Test
    void whenWayFromC1ToG5() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] excepted = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(bishopBlack.way(Cell.G5)).isEqualTo(excepted);
    }

    @Test
    void isDiagonalFromC1ToG4IsFalse() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        boolean rsl = bishopBlack.isDiagonal(bishopBlack.position(), Cell.G4);
        assertThat(rsl).isEqualTo(false);
    }
}