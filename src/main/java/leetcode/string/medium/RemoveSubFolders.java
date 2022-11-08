package leetcode.string.medium;

/*Given a list of folders folder, return the folders after removing all sub-folders in those folders.
  You may return the answer in any order.
  Input: folder = ["/a","/a/b","/c/d","/c/d/e","/c/f"]
  Output: ["/a","/c/d","/c/f"]
  Explanation: Folders "/a/b" is a subfolder of "/a" and "/c/d/e" is inside of folder "/c/d" in our filesystem.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSubFolders {

    private static final char FOLDER_SEPARATOR = '/';

    public static void main(String[] args) {
        RemoveSubFolders remove = new RemoveSubFolders();
        String[] folder = {"/a","/a/b","/c/d","/c/d/e","/c/f"};
        List<String> strings = remove.removeSubfolders(folder);
        for (String s : strings) {
            System.out.println(s);
        }
    }

    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> rootDirectories = new ArrayList<>();
        rootDirectories.add(folder[0]);

        for (int i = 1; i < folder.length; ++i) {
            if (!folder[i].startsWith(rootDirectories.get(rootDirectories.size() - 1) + FOLDER_SEPARATOR)) {
                rootDirectories.add(folder[i]);
            }
        }
        return rootDirectories;
    }
}
