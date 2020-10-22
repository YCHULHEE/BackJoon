public class PageNumGame {
    static int[] pageDigits = {1, 10, 100};

    public static void main(String[] args) {
       int[] pobi = {233, 234};
       int[] crong = {341, 342};

       int result = solution(pobi, crong);
    }

    public static int solution(int[] pobi, int[] crong) {
        if (checkPage(pobi, crong) == true) {
            return -1;
        }

        int pobiLeftPage = getSumOfPages(pobi[0]);
        int pobiRightPage = getSumOfPages(pobi[1]);
        int crongLeftPage = getSumOfPages(crong[0]);
        int crongRightPage = getSumOfPages(crong[1]);
        int pobiLargePage = getLargePage(pobiLeftPage, pobiRightPage);
        int crongLargePage = getLargePage(crongLeftPage, crongRightPage);

        if (pobiLargePage > crongLargePage) {
            return 1;
        }
        if (pobiLargePage < crongLargePage) {
            return 2;
        }
        if (pobiLargePage == crongLargePage) {
            return 0;
        }
        return -1;
    }

    public static boolean checkPage(int[] pobi, int[] crong) {
        if ((pobi[0] == 1) || (pobi[1] == 400) || (pobi[0] % 2 == 0) || (pobi[1] % 2 == 1)) {
            return true;
        }
        if (crong[0] == 1 || crong[1] == 400 || (crong[0] % 2 == 0) || (crong[1] % 2 == 1)) {
            return true;
        }
        return false;
    }

    public static int getLargePage(int leftPage, int rightPage) {
        if (leftPage > rightPage) {
            return leftPage;
        }
        if (leftPage < rightPage) {
            return rightPage;
        }
        return leftPage;
    }

    public static int getSumOfPages(int page) {
        int sumResult = 0;
        int productResult = 1;
        int tempPage = page;

        int length = (int) (Math.log10(page) + 1);
        for (int i = (length - 1); i >= 0; i--) {
            sumResult += (tempPage / pageDigits[i]);
            tempPage = (tempPage % pageDigits[i]);
        }
        tempPage = page;
        for (int i = (length - 1); i >= 0; i--) {
            productResult *= (tempPage / pageDigits[i]);
            tempPage = tempPage % pageDigits[i];
        }

        if (sumResult > productResult) {
            return sumResult;
        }
        if (sumResult < productResult) {
            return productResult;
        }
        return sumResult;
    }
}
