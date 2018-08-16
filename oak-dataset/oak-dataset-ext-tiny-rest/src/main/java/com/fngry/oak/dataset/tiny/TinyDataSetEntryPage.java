package com.fngry.oak.dataset.tiny;

import java.util.List;

public class TinyDataSetEntryPage {

    private int offset;

    private int limit;

    private int nextOffSet;

    private List<TinyDataSetEntryObject> entries;

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getNextOffSet() {
        return nextOffSet;
    }

    public void setNextOffSet(int nextOffSet) {
        this.nextOffSet = nextOffSet;
    }

    public List<TinyDataSetEntryObject> getEntries() {
        return entries;
    }

    public void setEntries(List<TinyDataSetEntryObject> entries) {
        this.entries = entries;
    }
}
