
/**
 *
 * @author R. Springer
 */
public class TileFactory {

    /**
     * Creates a Tile object based on the mapIcon number you give
     *
     * @param mapIcon number
     * @return Tile tile object
     */
    public Tile createTile(int mapIcon) {
        Tile tile;
        switch (mapIcon) {
                    
             case 0:
            tile = new Tile("bomb.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 1:
            tile = new Tile("bombWhite.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 2:
            tile = new Tile("boxCoin.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 3:
            tile = new Tile("boxCoin_boxed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 4:
            tile = new Tile("boxCoin_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 5:
            tile = new Tile("boxCoin_disabled_boxed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 6:
            tile = new Tile("boxCrate.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 7:
            tile = new Tile("boxCrate_double.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 8:
            tile = new Tile("boxCrate_single.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 9:
            tile = new Tile("boxCrate_warning.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 10:
            tile = new Tile("boxExplosive.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 11:
            tile = new Tile("boxExplosive_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 12:
            tile = new Tile("boxExplosive_used.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 13:
            tile = new Tile("boxItem.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 14:
            tile = new Tile("boxItem_boxed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 15:
            tile = new Tile("boxItem_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 16:
            tile = new Tile("boxItem_disabled_boxed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 17:
            tile = new Tile("brickBrown.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 18:
            tile = new Tile("brickGrey.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 19:
            tile = new Tile("bridgeA.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 20:
            tile = new Tile("bridgeB.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 21:
            tile = new Tile("bush.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 22:
            tile = new Tile("cactus.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 23:
            tile = new Tile("chain.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 24:
            tile = new Tile("doorClosed_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 25:
            tile = new Tile("doorClosed_top.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 26:
            tile = new Tile("doorOpen_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = false;
            break;
             case 27:
            tile = new Tile("doorOpen_top.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = false;
            break;
             case 28:
            tile = new Tile("fence.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 29:
            tile = new Tile("fenceBroken.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 30:
            tile = new Tile("grass.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 31:
            tile = new Tile("ladderMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 32:
            tile = new Tile("ladderTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 33:
            tile = new Lava("lava.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = false;
            break;
             case 34:
            tile = new Lava("lavaTop_high.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = false;
            break;
             case 35:
            tile = new Lava("lavaTop_low.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = false;
            break;
             case 36:
            tile = new Tile("leverLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 37:
            tile = new Tile("leverMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 38:
            tile = new Tile("leverRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 39:
            tile = new Tile("lockBlue.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 40:
            tile = new Tile("lockGreen.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 41:
            tile = new Tile("lockRed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 42:
            tile = new Tile("lockYellow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 43:
            tile = new Tile("mushroomBrown.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 44:
            tile = new Tile("mushroomRed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 45:
            tile = new Tile("plantPurple.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 46:
            tile = new Tile("rock.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 47:
            tile = new Tile("sign.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 48:
            tile = new Tile("signExit.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 49:
            tile = new Tile("signLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 50:
            tile = new Tile("signRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 51:
            tile = new Tile("snow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 52:
             tile = new Spikes("spikes.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid =false;
             break;
             case 53:
            tile = new Tile("spring.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 54:
            tile = new Tile("sprung.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 55:
            tile = new Tile("switchBlue.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 56:
            tile = new Tile("switchBlue_pressed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 57:
            tile = new Tile("switchGreen.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 58:
            tile = new Tile("switchGreen_pressed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 59:
            tile = new Tile("switchRed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 60:
            tile = new Tile("switchRed_pressed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 61:
            tile = new Tile("switchYellow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 62:
            tile = new Tile("switchYellow_pressed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 63:
            tile = new Tile("torch1.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 64:
            tile = new Tile("torch2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 65:
            tile = new Tile("torchOff.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 66:
            tile = new Water("water.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = false;
            break;
             case 67:
             tile = new Water("waterTop_high.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = false;
            break;
             case 68:
            tile = new Water("waterTop_low.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = false;
            break;
             case 69:
            tile = new Tile("weight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 70:
            tile = new Tile("weightAttached.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 71:
            tile = new Tile("window.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 72:
            tile = new Tile("dirt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 73:
            tile = new Tile("dirtCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 74:
            tile = new Tile("dirtCenter_rounded.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 75:
            tile = new Tile("dirtCliff_left.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 76:
            tile = new Tile("dirtCliff_right.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 77:
            tile = new Tile("dirtCliffAlt_left.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 78:
            tile = new Tile("dirtCliffAlt_right.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 79:
            tile = new Tile("dirtCorner_left.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 80:
            tile = new Tile("dirtCorner_right.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 81:
            tile = new Tile("dirtHalf - kopie.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 82:
            tile = new Tile("dirtHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 83:
            tile = new Tile("dirtHalf_left.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 84:
            tile = new Tile("dirtHalf_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 85:
            tile = new Tile("dirtHalf_right.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 86:
            tile = new Tile("dirtHill_left.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 87:
            tile = new Tile("dirtHill_right.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 88:
            tile = new Tile("dirtLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 89:
            tile = new Tile("dirtMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 90:
            tile = new Tile("dirtRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 91:
            tile = new Tile("grass.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 92:
            tile = new Tile("grassCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 93:
            tile = new Tile("grassCenter_round.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 94:
            tile = new Tile("grassCliff_left.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 95:
            tile = new Tile("grassCliff_right.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 96:
            tile = new Tile("grassCliffAlt_left.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 97:
            tile = new Tile("grassCliffAlt_right.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 98:
            tile = new Tile("grassCorner_left.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 99:
            tile = new Tile("grassCorner_right.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 100:
            tile = new Tile("grassHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 101:
            tile = new Tile("grassHalf_left.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 102:
            tile = new Tile("grassHalf_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 103:
            tile = new Tile("grassHalf_right.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 104:
            tile = new Tile("grassHill_left.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 105:
            tile = new Tile("grassHill_right.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 106:
            tile = new Tile("grassLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 107:
            tile = new Tile("grassMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 108:
            tile = new Tile("grassRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 109:
              tile = new Tile("planet.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 110:
              tile = new Tile("planetCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 111:
              tile = new Tile("planetCenter_rounded.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 112:
              tile = new Tile("planetCliff_left.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 113:
              tile = new Tile("planetCliff_right.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 114:
              tile = new Tile("planetCliffAlt_left.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 115:
              tile = new Tile("planetCliffAlt_right.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 116:
              tile = new Tile("planetCorner_left.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 117:
              tile = new Tile("planetCorner_right.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 118:
              tile = new Tile("planetHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 119:
              tile = new Tile("planetHalf_left.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 120:
              tile = new Tile("planetHalf_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 121:
              tile = new Tile("planetHalf_right.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 122:
              tile = new Tile("planetHill_left.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 123:
              tile = new Tile("planetHill_right.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 124:
              tile = new Tile("planetLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 125:
              tile = new Tile("planetMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 126:
              tile = new Tile("planetRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 127:
              tile = new Tile("sand.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 128:
              tile = new Tile("sandCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 129:
              tile = new Tile("sandCenter_rounded.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 130:
              tile = new Tile("sandCliff_left.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 131:
              tile = new Tile("sandCliff_right.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 132:
              tile = new Tile("sandCliffAlt_left.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 133:
              tile = new Tile("sandCliffAlt_right.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 134:
              tile = new Tile("sandCorner_leftg.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 135:
              tile = new Tile("sandCorner_right.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 136:
              tile = new Tile("sandHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 137:
              tile = new Tile("sandHalf_left.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 138:
              tile = new Tile("sandHalf_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 139:
              tile = new Tile("sandHalf_right.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 140:
              tile = new Tile("sandHill_left.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 141:
              tile = new Tile("sandHill_right.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 142:
              tile = new Tile("sandLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 143:
              tile = new Tile("sandMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 144:
              tile = new Tile("sandRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 145:
             tile = new Tile("snow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 146:
             tile = new Tile("snowCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 147:
             tile = new Tile("snowCenter_rounded.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 148:
             tile = new Tile("snowCliff_left.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 149:
             tile = new Tile("snowCliff_right.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 150:
             tile = new Tile("snowCliffAlt_left.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 151:
             tile = new Tile("snowCliffAlt_right.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 152:
             tile = new Tile("snowCorner_left.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 153:
             tile = new Tile("snowCorner_right.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 154:
             tile = new Tile("snowHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 155:
             tile = new Tile("snowHalf_left.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 156:
             tile = new Tile("snowHalf_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 157:
             tile = new Tile("snowHalf_right.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 158:
             tile = new Tile("snowHill_left.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 159:
             tile = new Tile("snowHill_right.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 160:
             tile = new Tile("snowLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 161:
             tile = new Tile("snowMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 162:
             tile = new Tile("snowRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 163:
            tile = new Tile("stone.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 164:
            tile = new Tile("stoneCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 165:
            tile = new Tile("stoneCenter_rounded.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 166:
            tile = new Tile("stoneCliff_left.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 167:
            tile = new Tile("stoneCliff_right.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 168:
            tile = new Tile("stoneCliffAlt_left.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 169:
            tile = new Tile("stoneCliffAlt_right.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 170:
            tile = new Tile("stoneCorner_left.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 171:
            tile = new Tile("stoneCorner_right.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 172:
            tile = new Tile("stoneHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 173:
            tile = new Tile("stoneHalf_left.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 174:
            tile = new Tile("stoneHalf_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 175:
            tile = new Tile("stoneHalf_right.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 176:
            tile = new Tile("stoneHill_left.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 177:
            tile = new Tile("stoneHill_right.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 178:
            tile = new Tile("stoneLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 179:
            tile = new Tile("stoneMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
             case 180:
            tile = new Tile("stoneRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
              tile.isSolid = true;
            break;
            default:
                tile = new Tile("grassMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
        }
        return tile;
    }
}
