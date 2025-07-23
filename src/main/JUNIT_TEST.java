package main;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JUNIT_TEST {

        @Test
        public void testInitialScreenSize() {
            GamePanel gp = new GamePanel();

            int expectedWidth = gp.originalTileSize * gp.scale * gp.maxScreenCol;
            int expectedHeight = gp.originalTileSize * gp.scale * gp.maxScreenRow;

            assertEquals(expectedWidth, gp.screenWidth);
            assertEquals(expectedHeight, gp.screenHeight);
        }

        @Test
        public void testNotNull() {
            GamePanel gp = new GamePanel();

            assertNotNull(gp.player);
            assertNotNull(gp.dice);
            assertNotNull(gp.eHandler);
            assertNotNull(gp.ui);
            assertNotNull(gp.tileM);
            assertNotNull(gp.keyH);
            assertNotNull(gp.music);
            assertNotNull(gp.se);
        }

        @Test
        public void testUpdateCalls() {
            GamePanel gp = new GamePanel();

            assertDoesNotThrow(() -> gp.update());
        }
    }

