package com.mojang.realmsclient.dto;

import com.google.common.collect.Lists;
import java.util.List;

public class PingResult extends ValueObject
{
    public List<RegionPingResult> pingResults = Lists.newArrayList();
    public List<Long> worldIds = Lists.newArrayList();
}
