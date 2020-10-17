public class GooGooDan {

        public int solution(int number) {
            return  count(number);
        }

        /**
         * https://msm8994.tistory.com/24 알고리즘 참고
         * @param number
         * @return
         */
        private int count(int number) {
            int result = 0;


            for (int cnt = 1; cnt <= number; cnt++) {

                String str = String.valueOf(cnt); // 문자열 변환

                for (int i = 0; i < str.length(); i++) {
                    char chk = str.charAt(i);

                    if (chk == '3' || chk == '6' || chk == '9') {//해당 일때만

                        result = result + 1;

                    }
                }


            }
            return result;
        }
    public static void main(String[] args) {

    }
}
