class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        // HashMap to store file content and corresponding file paths
        Map<String, List<String>> contentToFilePaths = new HashMap<>();

        for (String pathInfo : paths) {
            String[] parts = pathInfo.split(" ");
            String directoryPath = parts[0];

            for (int i = 1; i < parts.length; i++) {
                String fileDetails = parts[i];
                String[] fileInfo = fileDetails.split("\\("); 
                String fileName = fileInfo[0];
                String content = fileInfo[1].substring(0, fileInfo[1].length() - 1); 
                String filePath = directoryPath + "/" + fileName;

                List<String> filePaths = contentToFilePaths.getOrDefault(content, new ArrayList<>());
                filePaths.add(filePath);
                contentToFilePaths.put(content, filePaths);
            }
        }

        List<List<String>> duplicateGroups = new ArrayList<>();
        for (List<String> filePaths : contentToFilePaths.values()) {
            if (filePaths.size() > 1) {
                duplicateGroups.add(filePaths);
            }
        }

        return duplicateGroups;
    }
}