class Solution {

    /**
     * @param Integer $n
     * @return String
     */
    function generateTheString($n) {
        $s = "";
        if ($n % 2 == 0) {
            $s .= str_repeat('a', $n - 1);
            $s .= 'b';
        }
        else
            $s .= str_repeat('a', $n);
        return $s;
    }
}