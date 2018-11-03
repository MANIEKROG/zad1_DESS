package org.cos.zad1.ui.crypt;

public final class PermuteTable {

    private Integer[] firstPermutationArray;
    private Integer[] endPermutationArray;
    private Integer[] keyPermutationArray;
    private Integer[] numberOfShiftsArray;

    public PermuteTable() {
        initFirstPermut();
        initEndPermut();
        initKeyPermutation();
        initNumnerOFShifts();
    }

    public Integer[] getFirstPermutationArray() {
        return firstPermutationArray;
    }
    public Integer[] getEndPermutationArray() {
        return endPermutationArray;
    }
    public Integer[] getKeyPermutationArray() { return  keyPermutationArray; }
    public Integer[] getNumberOfShiftsArray() { return numberOfShiftsArray; }

    private void initNumnerOFShifts(){
        numberOfShiftsArray = new Integer[16];

        numberOfShiftsArray[0] = 1;
        numberOfShiftsArray[1] = 1;
        numberOfShiftsArray[2] = 2;
        numberOfShiftsArray[3] = 2;
        numberOfShiftsArray[4] = 2;
        numberOfShiftsArray[5] = 2;
        numberOfShiftsArray[6] = 2;
        numberOfShiftsArray[7] = 2;
        numberOfShiftsArray[8] = 1;
        numberOfShiftsArray[9] = 2;
        numberOfShiftsArray[10] = 2;
        numberOfShiftsArray[11] = 2;
        numberOfShiftsArray[12] = 2;
        numberOfShiftsArray[13] = 2;
        numberOfShiftsArray[14] = 2;
        numberOfShiftsArray[15] = 1;
    }

    private void initFirstPermut() {
        firstPermutationArray = new Integer[64];

        firstPermutationArray[0] = 58;
        firstPermutationArray[1] = 50;
        firstPermutationArray[2] = 42;
        firstPermutationArray[3] = 34;
        firstPermutationArray[4] = 26;
        firstPermutationArray[5] = 18;
        firstPermutationArray[6] = 10;
        firstPermutationArray[7] = 2;
        firstPermutationArray[8] = 60;
        firstPermutationArray[9] = 52;
        firstPermutationArray[10] = 44;
        firstPermutationArray[11] = 36;
        firstPermutationArray[12] = 28;
        firstPermutationArray[13] = 20;
        firstPermutationArray[14] = 12;
        firstPermutationArray[15] = 4;
        firstPermutationArray[16] = 62;
        firstPermutationArray[17] = 54;
        firstPermutationArray[18] = 46;
        firstPermutationArray[19] = 38;
        firstPermutationArray[20] = 30;
        firstPermutationArray[21] = 22;
        firstPermutationArray[22] = 14;
        firstPermutationArray[23] = 6;
        firstPermutationArray[24] = 64;
        firstPermutationArray[25] = 56;
        firstPermutationArray[26] = 48;
        firstPermutationArray[27] = 40;
        firstPermutationArray[28] = 32;
        firstPermutationArray[29] = 24;
        firstPermutationArray[30] = 16;
        firstPermutationArray[31] = 8;
        firstPermutationArray[32] = 57;
        firstPermutationArray[33] = 49;
        firstPermutationArray[34] = 41;
        firstPermutationArray[35] = 33;
        firstPermutationArray[36] = 25;
        firstPermutationArray[37] = 17;
        firstPermutationArray[38] = 9;
        firstPermutationArray[39] = 1;
        firstPermutationArray[40] = 59;
        firstPermutationArray[41] = 51;
        firstPermutationArray[42] = 43;
        firstPermutationArray[43] = 35;
        firstPermutationArray[44] = 27;
        firstPermutationArray[45] = 19;
        firstPermutationArray[46] = 11;
        firstPermutationArray[47] = 3;
        firstPermutationArray[48] = 61;
        firstPermutationArray[49] = 53;
        firstPermutationArray[50] = 45;
        firstPermutationArray[51] = 37;
        firstPermutationArray[52] = 29;
        firstPermutationArray[53] = 21;
        firstPermutationArray[54] = 13;
        firstPermutationArray[55] = 5;
        firstPermutationArray[56] = 63;
        firstPermutationArray[57] = 55;
        firstPermutationArray[58] = 47;
        firstPermutationArray[59] = 39;
        firstPermutationArray[60] = 31;
        firstPermutationArray[61] = 23;
        firstPermutationArray[62] = 15;
        firstPermutationArray[63] = 7;

        for(int i = 0; i < 64; i++ ) firstPermutationArray[i]--;
    }

    private void initEndPermut() {
        endPermutationArray = new Integer[64];

        endPermutationArray[0] = 40;
        endPermutationArray[1] = 8;
        endPermutationArray[2] = 48;
        endPermutationArray[3] = 16;
        endPermutationArray[4] = 56;
        endPermutationArray[5] = 24;
        endPermutationArray[6] = 64;
        endPermutationArray[7] = 32;
        endPermutationArray[8] = 39;
        endPermutationArray[9] = 7;
        endPermutationArray[10] = 47;
        endPermutationArray[11] = 15;
        endPermutationArray[12] = 55;
        endPermutationArray[13] = 23;
        endPermutationArray[14] = 63;
        endPermutationArray[15] = 31;
        endPermutationArray[16] = 38;
        endPermutationArray[17] = 6;
        endPermutationArray[18] = 46;
        endPermutationArray[19] = 14;
        endPermutationArray[20] = 54;
        endPermutationArray[21] = 22;
        endPermutationArray[22] = 62;
        endPermutationArray[23] = 30;
        endPermutationArray[24] = 37;
        endPermutationArray[25] = 5;
        endPermutationArray[26] = 45;
        endPermutationArray[27] = 13;
        endPermutationArray[28] = 53;
        endPermutationArray[29] = 21;
        endPermutationArray[30] = 61;
        endPermutationArray[31] = 29;
        endPermutationArray[32] = 36;
        endPermutationArray[33] = 4;
        endPermutationArray[34] = 44;
        endPermutationArray[35] = 12;
        endPermutationArray[36] = 52;
        endPermutationArray[37] = 20;
        endPermutationArray[38] = 60;
        endPermutationArray[39] = 28;
        endPermutationArray[40] = 35;
        endPermutationArray[41] = 3;
        endPermutationArray[42] = 43;
        endPermutationArray[43] = 11;
        endPermutationArray[44] = 51;
        endPermutationArray[45] = 19;
        endPermutationArray[46] = 59;
        endPermutationArray[47] = 27;
        endPermutationArray[48] = 34;
        endPermutationArray[49] = 2;
        endPermutationArray[50] = 42;
        endPermutationArray[51] = 10;
        endPermutationArray[52] = 50;
        endPermutationArray[53] = 18;
        endPermutationArray[54] = 58;
        endPermutationArray[55] = 26;
        endPermutationArray[56] = 33;
        endPermutationArray[57] = 1;
        endPermutationArray[58] = 41;
        endPermutationArray[59] = 9;
        endPermutationArray[60] = 49;
        endPermutationArray[61] = 17;
        endPermutationArray[62] = 57;
        endPermutationArray[63] = 25;

        for(int i = 0; i < 64; i++ ) endPermutationArray[i]--;
    }

    public void initKeyPermutation() {
        keyPermutationArray = new Integer[56];

        keyPermutationArray[0] = 57;
        keyPermutationArray[1] = 49;
        keyPermutationArray[2] = 41;
        keyPermutationArray[3] = 33;
        keyPermutationArray[4] = 25;
        keyPermutationArray[5] = 17;
        keyPermutationArray[6] = 9;
        keyPermutationArray[7] = 1;
        keyPermutationArray[8] = 58;
        keyPermutationArray[9] = 50;
        keyPermutationArray[10] = 42;
        keyPermutationArray[11] = 34;
        keyPermutationArray[12] = 26;
        keyPermutationArray[13] = 18;
        keyPermutationArray[14] = 10;
        keyPermutationArray[15] = 2;
        keyPermutationArray[16] = 59;
        keyPermutationArray[17] = 51;
        keyPermutationArray[18] = 43;
        keyPermutationArray[19] = 35;
        keyPermutationArray[20] = 27;
        keyPermutationArray[21] = 19;
        keyPermutationArray[22] = 11;
        keyPermutationArray[23] = 3;
        keyPermutationArray[24] = 60;
        keyPermutationArray[25] = 52;
        keyPermutationArray[26] = 44;
        keyPermutationArray[27] = 36;
        keyPermutationArray[28] = 63;
        keyPermutationArray[29] = 55;
        keyPermutationArray[30] = 47;
        keyPermutationArray[31] = 39;
        keyPermutationArray[32] = 31;
        keyPermutationArray[33] = 23;
        keyPermutationArray[34] = 15;
        keyPermutationArray[35] = 7;
        keyPermutationArray[36] = 62;
        keyPermutationArray[37] = 54;
        keyPermutationArray[38] = 46;
        keyPermutationArray[39] = 38;
        keyPermutationArray[40] = 30;
        keyPermutationArray[41] = 22;
        keyPermutationArray[42] = 14;
        keyPermutationArray[43] = 6;
        keyPermutationArray[44] = 61;
        keyPermutationArray[45] = 53;
        keyPermutationArray[46] = 45;
        keyPermutationArray[47] = 37;
        keyPermutationArray[48] = 29;
        keyPermutationArray[49] = 21;
        keyPermutationArray[50] = 13;
        keyPermutationArray[51] = 5;
        keyPermutationArray[52] = 28;
        keyPermutationArray[53] = 20;
        keyPermutationArray[54] = 12;
        keyPermutationArray[55] = 4;

        for(int i = 0; i < 55; i++ ) keyPermutationArray[i]--;
    }
}