import java.util.HashMap;
import java.util.Map;

public class ProductIterator {

	int positionIndex = 0;

	String[] productslist;

	public ProductIterator(HashMap<String, Integer> menu_data) {
		productslist = new String[menu_data.size()];
		int i=0;
		for(Map.Entry<String,Integer> entry : menu_data.entrySet())
		{
			String key = entry.getKey();
			productslist[i] = key;
			i++;
		}
	}

	public boolean hasNext() {
		if(positionIndex < productslist.length &&
				productslist[positionIndex] != null)
			return true;
		else
			return false;
	}

	public HashMap<Integer, String> next() {

		String item = productslist[positionIndex];
		positionIndex = positionIndex + 1;
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(positionIndex, item);
		return map;
	}

	public void MoveToHead() {
		positionIndex = 0;

	}

	public void Remove() {
		//This method is not in implementation
	}


}
