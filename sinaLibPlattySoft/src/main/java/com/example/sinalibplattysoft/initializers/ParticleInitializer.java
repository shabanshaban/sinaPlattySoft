package com.example.sinalibplattysoft.initializers;


import com.example.sinalibplattysoft.Particle;

import java.util.Random;


public interface ParticleInitializer {

	void initParticle(Particle p, Random r);

}
