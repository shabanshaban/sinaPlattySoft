package com.example.sinaplattysoft.leonids.initializers;


import com.example.sinaplattysoft.leonids.Particle;

import java.util.Random;


public interface ParticleInitializer {

	void initParticle(Particle p, Random r);

}
