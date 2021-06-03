public class Pool {
    /** the object pool is an object that provide only two methods */

    public T acquire(){}; //return an object from the pool and then remove it
    public void release(T obj) {}; //add the object to the pool

    /** the pool have a fixed dimension and is implemented like a queue that add and 
     * remove frome the rear side of the queue. when we pick an element from the pool,
     * we can use it and when we have finished, rather of destroy it, we can put it back
     * in the pool. the main use of that policy is gamedev. Example:
     * i have a game with some enemies, when i kill one of them, we can make it electeble for 
     * the garbage collection, but we have no guarantees that it will be destroyied soon.
     * with the object pool we can recycle the objects in other words
     */

}
