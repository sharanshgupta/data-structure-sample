package leetcode.linkedlist.medium;

/*
  Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.

  Implement the LRUCache class:

  LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
  int get(int key) Return the value of the key if the key exists, otherwise return -1.
  void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.
  The functions get and put must each run in O(1) average time complexity.
*/

import java.util.LinkedHashMap;

class LRUCache {
  LinkedHashMap <Integer,Integer> map;
  int cap;
  public LRUCache(int capacity) {
    this.cap = capacity;
    map = new LinkedHashMap<>();
  }

  public int get(int key) {
    if(!map.containsKey(key)){
      return -1;
    }
    makeRecent(key);
    return map.get(key);
  }

  public void put(int key, int value) {
    if(map.containsKey(key)){
      map.remove(key);
    }
    while(map.size() >= this.cap){
      map.remove(map.keySet().iterator().next());
    }
    map.put(key,value);
  }

  public void makeRecent(int key){
    int val = map.get(key);
    map.remove(key);
    map.put(key,val);
  }
}
