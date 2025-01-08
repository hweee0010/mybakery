extends CharacterBody2D

func _physics_process(delta):
	var direction = Input.get_vector("move_left","move_right","move_up","move_down")
	velocity = direction * 300
	move_and_slide()

	# play walk animation
	if velocity.length() > 0.0:
		if Input.is_action_pressed("move_right") or Input.is_action_pressed("move_up"):
			$Body.play("walk_right")
		elif Input.is_action_pressed("move_left") or Input.is_action_pressed("move_down"):
			$Body.play("walk_left")
		 

	else:
		# play idle animation
		$Body.stop()
