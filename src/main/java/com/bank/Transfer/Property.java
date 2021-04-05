package com.bank.Transfer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Property implements AutoConstant {
public String getProperty(String values) throws FileNotFoundException, IOException
{
	Properties p=new Properties();
	p.load(new FileInputStream(propertyfilepath));
	return p.getProperty(values);
}
}
