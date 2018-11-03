package org.cos.zad1.ui.crypt;

import java.util.ArrayList;
import java.util.List;

import org.cos.zad1.ui.controller.MainFrameController;

public class Encrypt {
    private List<Boolean> allFileBites = new ArrayList<Boolean>();

    private List<Boolean> sixtyFourBites = new ArrayList<Boolean>(64);
    private List<Boolean> permutedSixtyFourBites = new ArrayList<Boolean>(64);

    private List<Boolean> userKey = new ArrayList<Boolean>(64);
    private List<Boolean> permutedUserKey = new ArrayList<Boolean>();

    private List<Boolean> leftBlock = new ArrayList<Boolean>(32);
    private List<Boolean> rightBlock = new ArrayList<Boolean>(32);

    //Constructor
    public Encrypt(List<Boolean> BlockBites) {
        this.allFileBites = BlockBites;

        for(int i = 0; i < 64; i++) {
            this.userKey.add(allFileBites.get(i));
        }
    }

    //getters
    public List<Boolean> getAllFileBites() {
        return this.allFileBites;
    }

    public List<Boolean> getSixtyFourBites() {
        return this.sixtyFourBites;
    }

    public List<Boolean> getPermutedSixtyFourBites() {
        return this.permutedSixtyFourBites;
    }

    public List<Boolean> getUserKey() {
        return this.userKey;
    }

    public List<Boolean> getPermutedUserKey() {
        return this.permutedUserKey;
    }

    public List<Boolean> getLeftBlock() {
        return this.leftBlock;
    }

    public List<Boolean> getRightBlock() {
        return this.rightBlock;
    }


    //GET 64 BITES FROM ALL FILE BITES
    public void get64bites() {
        this.sixtyFourBites.clear();

        for(int i = 100; i < 163; i++) {
            this.sixtyFourBites.add(this.allFileBites.get(i));
        }
    }

    //dev
    public void devPrintBits(List<Boolean> oryginal, List<Boolean> permuted) {
        String przed = "";
        String po = "";

        for(int i = 0; i < oryginal.size(); i++) {
            przed += oryginal.get(i);
        }

        for(int i = 0; i < permuted.size(); i++) {
            po += permuted.get(i);
        }

        System.out.println("przed permutacją: " + przed);
        System.out.println("po    permutacji: " + po);
        System.out.println("size: " + permuted.size());
    }

    //DELETE FIRST 64 BITES FROM ALL FILE BITES
    private void deleteFirst64bitesFromAllFileBites() {
        for(int i = 0; i < 64; i++) {
            this.allFileBites.remove(i);
        }
    }

    //PERMUTATIONS
    public void doAPermutation(List<Boolean> bitesToPermutation, List<Boolean> permutationResault, Integer[] permutationArray) {
        System.out.println("Dlugosc permutaationArray " + permutationArray.length);

        for(int i = 0; i < permutationArray.length; i++) {
            permutationResault.add(bitesToPermutation.get(permutationArray[i]));

        System.out.println("permutation resault: " + permutationResault.get(i));
        }
    }

    //SPLIT TEXT INTO TWO PARTS - LEFT AND RIGHT. BOTH ARE 32 BITS LONG
    public void splitSixtyFourBitesIntoTwoParts() {
        for(int i = 0; i < 64; i++) {
            if(i < 32) this.leftBlock.add(this.sixtyFourBites.get(i));
            else this.rightBlock.add(this.sixtyFourBites.get(i));
        }
    }
}
