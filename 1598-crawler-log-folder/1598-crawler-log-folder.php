class Solution {

    /**
     * @param String[] $logs
     * @return Integer
     */
    function minOperations($logs) {
        $list = new SplStack();

        foreach($logs as $log) {

            
            if($log == "../" && !$list->isEmpty()) {
                $list->pop();
            } elseif($log != "./" && $log != "../") {
                $list->push($log);
            } 
        }

        return $list->count();
    }
}