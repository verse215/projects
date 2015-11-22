This is a simple program that compares two files. Using Java's FileInputStream class this program will perform a byte comparison of both files until the EOF is reached.

If one file is longer than the other we return false
if the bytes ever mismatch we return false
otherwise the files are the same and we return true
