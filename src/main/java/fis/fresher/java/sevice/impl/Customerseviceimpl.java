package fis.fresher.java.sevice.impl;

import java.util.List;
import java.util.function.Consumer;

import org.springframework.core.codec.Decoder;
import org.springframework.core.codec.Encoder;
import org.springframework.http.codec.CodecConfigurer.CustomCodecs;
import org.springframework.http.codec.CodecConfigurer.DefaultCodecConfig;
import org.springframework.http.codec.HttpMessageReader;
import org.springframework.http.codec.HttpMessageWriter;
import org.springframework.stereotype.Service;

import fis.fresher.java.jpa.entity.OrderProduct;
import fis.fresher.java.jpa.sevice.Oderproductsevice;
import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class Customerseviceimpl implements CustomCodecs {
	@Override
	public void register(Object codec) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerWithDefaultConfig(Object codec) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerWithDefaultConfig(Object codec, Consumer<DefaultCodecConfig> configConsumer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decoder(Decoder<?> decoder) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void encoder(Encoder<?> encoder) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reader(HttpMessageReader<?> reader) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void writer(HttpMessageWriter<?> writer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withDefaultCodecConfig(Consumer<DefaultCodecConfig> codecsConfigConsumer) {
		// TODO Auto-generated method stub
		
	}



}
