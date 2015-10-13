package parallelsort;
import java.util.Arrays;
import java.io.File;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

/**
 * Created by mb on 10/1/15.
 * Arrays.paralellSort()
 The various flavors of parallelSort implement a parallel sort-merge algorithm that
 recursively breaks the array into pieces, sorts them, then recombines them concurrently
 and transparently. Using it in place of the previous, sequential, Arrays.sort method
 results in gains in performance and efficiency when sorting large arrays. For instance,
 the code below uses the serial sort() and parallel parallelSort() methods on the Array
 class to sort the same array of data
 http://www.drdobbs.com/jvm/parallel-array-operations-in-java-8/240166287
 result:
 Serial sort:
 --Array size: 5562400
 --Elapsed sort time: 333

 Parallel sort:
 --Array size: 5562400
 --Elapsed sort time: 218

 Process finished with exit code 0
 */

public class ParallelSort
	{
	public static void main(String[] args)
		{
		ParallelSort mySort = new ParallelSort();

		int[] src = null;

		System.out.println("\nParallel sort:");
		src = mySort.getData();

		mySort.sortIt(src);

		}

	public void sortIt(int[] src)
		{
		Arrays.parallelSort(src);
		for (Integer element = 0; element < src.length; element++) {
			if (element % 1000 == 0) {
				//System.out.print(element + " ");
				if (element % 10000 == 0) {
					//System.out.println();
				}
			}
		}

		}






		private int[] getData()
		{
			try {
				File file = new File("src/parallelsort/myimage.png");
				BufferedImage image = ImageIO.read(file);
				int w = image.getWidth();
				int h = image.getHeight();
				int[] src = image.getRGB(0, 0, w, h, null, 0, w);
				System.out.println("image.getRGD length" + src.length);
				System.out.println(w);
				System.out.println(h);
				System.out.println("not sure what this is " + image.getRGB(0, 0, w, h, null, 0, w));

				int[] data = new int[src.length * 20];
				//System.out.println("image.getRGD length X 20 " + data.length);

				for ( int i = 0; i < 20; i++ ) {
					System.arraycopy(
							                src, 0, data, i*src.length, src.length);
				}
				return data;
			}
			catch ( Exception e ) {
				e.printStackTrace();
			}
		return null;
		}
	 }