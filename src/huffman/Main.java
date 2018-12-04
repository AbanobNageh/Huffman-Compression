package huffman;

public class Main {
	public static void main(String[] args) {
		HuffmanCompressor huffman = new HuffmanCompressor();
		huffman.compressAndDecompressFile("input.txt");
		//huffman.compressAndDecompressFolder("E:\\Programming Projects\\Eclipse\\Huffman\\test");
	}
}