package com.hackathongestamp2020.Backend;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "ventas")
public class Ventas {

    public String region;
    public String country;
    public String item_type;
    public String sales_channel;
    public Character order_priority;
    public Date order_date;
    public Integer order_id;
    public String ship_date;
    public Integer units_sold;
    public String unit_price;
    public String unit_cost;
    public String total_revenue;
    public String total_cost;
    public String total_profit;
}
