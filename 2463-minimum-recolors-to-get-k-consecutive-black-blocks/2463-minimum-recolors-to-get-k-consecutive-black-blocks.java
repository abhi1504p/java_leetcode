class Solution {
   	public static int minimumRecolors(String blocks, int k)
	{
		int leftPointer = 0, rightPointer = k - 1;
		int minOperations = Integer.MAX_VALUE;
		while (rightPointer < blocks.length())
		{
			int localCount = 0;
			for (int start = leftPointer; start <= rightPointer; start++)
			{
				if (blocks.charAt(start) == 'W')
				{
					localCount++;
				}
			}
			leftPointer++;
			rightPointer++;
			minOperations = Math.min(minOperations, localCount);
		}
		return minOperations;
	}
}