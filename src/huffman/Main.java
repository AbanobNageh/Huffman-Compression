package huffman;

public class Main {
	public static void main(String[] args) {
		HuffmanCompressor huffman = new HuffmanCompressor();
		
		// run the compression on a test file.
		huffman.compressAndDecompressFile("testFile.txt");

		// run the compression on a test folder.
		//huffman.compressAndDecompressFolder("test\\");
	}
}