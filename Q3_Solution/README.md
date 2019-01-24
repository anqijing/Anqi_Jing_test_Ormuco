# Question:
Design a LRU cache.

## Design ideas:
The LRU cache should support the operations: lookup, insert and delete
1. Lookup: If the requested entry is in the cache, just return it. If not, return null;
2. Insert: When client insert the new entry into the cache, check if the number of entries is larger than the capacity of the cache. 
It it is, remove the least recently used entry first, then insert the entry as the most recently used item.
3. Delete: Delete the item in the cache.

## Data structures:
1. To achieve the fast lookup, use the hash.
2. Since we need to insert entry as the most recently item and delete the least recently used item, using a doubly linked list (queue) can help us to do that.
3. By using hash and linked list, the runtime of operations, lookup, insert, and delete, can be achieved in O(1).

## Implementation
1. Define a CacheNode class to store the information, including IP, longitutde, latitude, expiration time.
2. Define a LRUcache class, containing a hash table and a doubly linked list of CacheNode.
